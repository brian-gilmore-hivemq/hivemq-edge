import { FC } from 'react'
import { useTranslation } from 'react-i18next'
import { Center, Flex, Image } from '@chakra-ui/react'

import ReactLogo from '@/assets/welcome-first-time-logo.svg'

import PageContainer from '@/components/PageContainer.tsx'
import Onboarding from '@/modules/Welcome/components/Onboarding.tsx'

const WelcomePage: FC = () => {
  const { t } = useTranslation()

  return (
    <PageContainer title={t('welcome.title') as string} subtitle={t('welcome.description') as string}>
      <Flex flexDirection={'column'}>
        <Flex flexDirection={{ base: 'column', lg: 'row' }}>
          <Onboarding />
          <Center flex={1} m={4}>
            <Image boxSize={400} src={ReactLogo} alt={t('branding.appName') as string} />
          </Center>
        </Flex>
      </Flex>
    </PageContainer>
  )
}

export default WelcomePage
